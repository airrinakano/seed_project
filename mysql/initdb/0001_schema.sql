DROP SCHEMA IF EXISTS mysqldb;
CREATE SCHEMA mysqldb;
use mysqldb;
-- -----------------------------------------------------
-- 以下　アカウント関連マスタテーブル
-- ----------------------------------------------------
-- -----------------------------
-- COMPANY
-- -----------------------------
CREATE TABLE IF NOT EXISTS m_company(
  company_id INTEGER NOT NULL AUTO_INCREMENT COMMENT '会社組織ID',
  company_name VARCHAR(65) NOT NULL COMMENT '会社組織名称',
  system_login VARCHAR(65) NOT NULL COMMENT 'システムログイン',
  shared_secret VARCHAR(65) NOT NULL COMMENT 'カタログ連携パスワード',
  po_url VARCHAR(128) NOT NULL COMMENT 'POのURL',
  cxml_id VARCHAR(65) NOT NULL COMMENT 'cxmlID',
  cxml_password VARCHAR(65) NOT NULL COMMENT 'cxmlパスワード',
  created_by VARCHAR(20) NOT NULL COMMENT '作成者',
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  updated_by VARCHAR(20) NOT NULL COMMENT '最終更新者',
  updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最終更新日時',
  delete_flag boolean NOT NULL DEFAULT false COMMENT '終了・無効フラグ',
  INDEX(company_name),
  INDEX(created_by),
  INDEX(created_at),
  INDEX(updated_by),
  INDEX(updated_at),
  INDEX(delete_flag),
  PRIMARY KEY (company_id)
);