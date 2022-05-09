export const message = Object.freeze({
  MUSTINPUT: "必須項目です。",
  MAILVALIDATION: "メールアドレスの形式が正しくありません。",
  ERR_KEYWORD: "50文字以内でキーワードを入力してください。",
  ERR_KEYWORD_ESCAPE_SEQUENCE: "使用できない文字が含まれています。",
  ERROR_AUTHENTIFICATION:
    " 引き続きご利用になる場合は、再度ログインしてください。",
  ERR_LOGIN_FAILED:
    " ユーザーID・パスワードに誤りがあるか、登録されていません。",
  // システムエラー
  ERR_SERVER_ERROR:
    "システムエラーが発生しました。大変お手数ですが、サイト管理者にお問い合わせください。",
});

export default {
  data: function () {
    return {
      message: message,
    };
  },
};
