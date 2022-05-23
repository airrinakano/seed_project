DROP SCHEMA IF EXISTS mysqldb;
CREATE SCHEMA mysqldb;
use mysqldb;

-- -----------------------------
--  PRODUCT
-- -----------------------------
CREATE TABLE IF NOT EXISTS m_product(
  product_id INTEGER NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  product_name VARCHAR(65) NOT NULL COMMENT '商品名',
  unit_price INTEGER NOT NULL COMMENT '単価',
  tax INTEGER NOT NULL COMMENT '商品税',
  created_by VARCHAR(20) NOT NULL COMMENT '作成者',
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  updated_by VARCHAR(20) NOT NULL COMMENT '最終更新者',
  updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最終更新日時',
  delete_flag boolean NOT NULL DEFAULT false COMMENT '終了・無効フラグ',
  INDEX(created_by),
  INDEX(created_at),
  INDEX(updated_by),
  INDEX(updated_at),
  INDEX(delete_flag),
  PRIMARY KEY (product_id)
);

-- -----------------------------
-- MEMBER
-- -----------------------------
CREATE TABLE IF NOT EXISTS m_member(
  -- EC-CUBEでの型等確認
  member_id VARCHAR(20) NOT NULL COMMENT '会員ID',
  first_name VARCHAR(30) NOT NULL COMMENT '名',
  last_name VARCHAR(30) NOT NULL COMMENT '姓',
  pass_word VARCHAR(30) NOT NULL COMMENT 'パスワード',
  init_email VARCHAR(65) NOT NULL COMMENT '登録時メールアドレス',
  address_name VARCHAR(65) COMMENT '住所',
  created_by VARCHAR(20) NOT NULL COMMENT '作成者',
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  updated_by VARCHAR(20) NOT NULL COMMENT '最終更新者',
  updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最終更新日時',
  delete_flag boolean NOT NULL DEFAULT false COMMENT '終了・無効フラグ',
  display_system_maintenance_notice_flag boolean NOT NULL DEFAULT true COMMENT 'システムメンテナンス通知表示フラグ',
  INDEX(created_by),
  INDEX(created_at),
  INDEX(updated_by),
  INDEX(updated_at),
  INDEX(delete_flag),
  PRIMARY KEY (member_id)
);

-- -----------------------------
-- ORDER INFO
-- -----------------------------
CREATE TABLE IF NOT EXISTS t_order_info (
  -- 主キー
  order_id VARCHAR(19) NOT NULL COMMENT 'orderID',
  member_id VARCHAR (20) NOT NULL COMMENT '購入者ID',
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最終更新日時',
  updated_by VARCHAR(20) NOT NULL COMMENT '最終更新者',
  INDEX(created_at),
  INDEX(updated_at),
  INDEX(updated_by),
  PRIMARY KEY (order_id),
  FOREIGN KEY(member_id) REFERENCES m_member(member_id) ON DELETE RESTRICT
);

-- -----------------------------
-- ORDER Detail
-- -----------------------------
CREATE TABLE IF NOT EXISTS t_order_detail (
  -- 主キー
  order_id VARCHAR(19) NOT NULL COMMENT '注文ID',
  line_number INTEGER NOT NULL COMMENT 'カート内のシーケンス番号',
  -- 本文
  quantity INTEGER NOT NULL COMMENT '量',
  product_id INTEGER NOT NULL COMMENT '商品ID',
  unit_price INTEGER NOT NULL COMMENT '単価',
  shipping_fee INTEGER NOT NULL COMMENT '商品単位送料',
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  INDEX(created_at),
  PRIMARY KEY (order_id, line_number),
  -- ORDER INFORMATIONとの紐づけ
  FOREIGN KEY(order_id) REFERENCES t_order_info(order_id) ON DELETE RESTRICT,
  FOREIGN KEY(product_id) REFERENCES m_product(product_id) ON DELETE RESTRICT
);