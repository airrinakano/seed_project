<template>
  <v-container>
    <v-alert
      type="error"
      color="red"
      v-if="loginFailed || loginEmailFailed"
      class="error-massage"
    >
      {{ alertMessage }}
    </v-alert>
    <div class="main-content-area white-background">
      <v-row>
        <v-col>
          <v-form>
            <v-card class="login-card mx-auto" max-width="30rem">
              <v-card-text class="black-text">
                <div>
                  <p class="inline-block">姓</p>
                </div>
                <v-text-field
                  v-model="surname"
                  background-color="selectbox"
                  placeholder="名前を入力してください"
                  :error="loginEmailFailed"
                  outlined
                ></v-text-field>
                <div>
                  <p class="inline-block">名</p>
                </div>
                <v-text-field
                  v-model="firstName"
                  background-color="selectbox"
                  placeholder="名前を入力してください"
                  :error="loginEmailFailed"
                  outlined
                ></v-text-field>
                <div>
                  <p class="inline-block">メールアドレス</p>
                </div>
                <v-text-field
                  v-model="idInputed"
                  background-color="selectbox"
                  placeholder="メールアドレスを入力してください"
                  :error="loginEmailFailed"
                  outlined
                ></v-text-field>
                <p>パスワード</p>
                <v-text-field
                  v-model="passwordInputed"
                  background-color="selectbox"
                  placeholder="半角英数字5字以上で入力してください"
                  :type="isPasswordDisplayed ? 'text' : 'password'"
                  outlined
                  hide-details
                  autocomplete="off"
                  :error="loginFailed"
                  :append-icon="
                    isPasswordDisplayed ? 'mdi-eye' : 'mdi-eye-off-outline'
                  "
                  @click:append="isPasswordDisplayed = !isPasswordDisplayed"
                  @keydown.enter="login"
                ></v-text-field>
                <div>
                  <p class="inline-block">生年月日</p>
                </div>
                <v-text-field
                  v-model="firstName"
                  background-color="selectbox"
                  placeholder="名前を入力してください"
                  :error="loginEmailFailed"
                  outlined
                ></v-text-field>
                <v-radio-group v-model="row" row>
                  <v-radio label="男" value="man"></v-radio>
                  <v-radio label="女" value="women"></v-radio>
                  <v-radio label="その他" value="others"></v-radio>
                  <v-radio label="回答しない" value="unanswered"></v-radio>
                </v-radio-group>
              </v-card-text>
              <v-card-actions>
                <v-btn
                  class="white--text mx-auto body-1"
                  width="40%"
                  height="3.5rem"
                  color="greyBtn"
                  rounded
                  depressed
                  :loading="loading"
                  @click="login"
                >
                  アカウントを作成する</v-btn
                >
              </v-card-actions>
            </v-card>
          </v-form>
        </v-col>
      </v-row>
    </div>
  </v-container>
</template>

<script>
import messageMixin from "@/mixins/messageMixins.js";
export default {
  /* eslint-disable */
  name: "Login",

  data: () => ({
    /**
     * ログインに失敗したかどうかの判定フラグ
     * @type {boolean}
     */
    loginFailed: false,
    /**
     * Eメールアドレスが適切かどうかのフラグ
     * @type {boolean}
     */
    loginEmailFailed: false,
    /**
     * 読みこみ中かどうかのフラグ
     * @type {boolean}
     */
    loading: false,
    /**
     * パスワードのアイコン表示切替フラグ
     * @type {boolean}
     */
    isPasswordDisplayed: false,
    /**
     * パスワード再設定用URL
     * @type {String}
     */
    forgot: process.env.ESTAND_BASE_URL + "/forgot",
    /**
     * アラートメッセージ
     * @type {String}
     */
    alertMessage: "",

    /**
     * 入力されたID
     * @type {String}
     */
    idInputed: "",
    /**
     * 入力されたパスワード
     * @type {String}
     */
    passwordInputed: "",
    authLoading: false,
    companyIdLoading: false,
    isApproverLoading: false,
    shippingAddressListLoading: false,
    SSOUrl: process.env.SSO_URL,
  }),
  mixins: [messageMixin],
  created: function () {},

  methods: {
    /**
     * Eメールのバリデーションチェック
     * @module validationEmail
     */
    validationEmail: function () {
      const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      if (this.idInputed && !this.passwordInputed) {
        this.loginFailed = true;
        this.loginEmailFailed = false;
        this.alertMessage = this.message.MUSTINPUT;
        return false;
      } else if (!this.idInputed) {
        this.loginEmailFailed = true;
        this.loginFailed = false;
        this.alertMessage = this.message.MUSTINPUT;
        return false;
      } else if (!re.test(this.idInputed)) {
        this.loginEmailFailed = true;
        this.loginFailed = false;
        this.alertMessage = this.message.MAILVALIDATION;
        return false;
      } else if (this.idInputed && this.passwordInputed) {
        this.loginEmailFailed = false;
        this.alertMessage = "";
        return true;
      }
    },
    /**
     * パスワードのバリデーションチェック
     * @module validationPassword
     * @param success Eメールのバリデーションチェックが成功しているかどうか
     */
    validationPassword: function (success) {
      if (!success) {
        return false;
      } else if (!this.idInputed && this.passwordInputed) {
        this.loginEmailFailed = true;
        this.loginFailed = false;
        this.alertMessage = this.message.MUSTINPUT;
        return false;
      } else if (!this.passwordInputed) {
        this.loginFailed = true;
        this.loginEmailFailed = false;
        this.alertMessage = this.message.MUSTINPUT;
        return false;
      } else if (this.idInputed && this.passwordInputed) {
        this.loginFailed = false;
        this.alertMessage = "";
        return true;
      }
    },

    /**
     * ログイン処理
     * @module login
     */
    login: async function () {
      var success = this.validationEmail();
      var Passwordsuccess = this.validationPassword(success);
      if (!Passwordsuccess) {
        return;
      }
      if (this.loading || !this.idInputed || !this.passwordInputed) {
        return;
      }
      this.loading = true;
      this.alertMessage = "";
      this.loginFailed = false;

      await this.axios
        .get("/api/prelogin")
        .then(async (response) => {
          this.$store.commit("setCsrf", response.data);
        })
        .catch((e) => {})
        .finally(() => {
          this.loading = false;
        });

      var params = new URLSearchParams();
      params.append("email", this.idInputed);
      params.append("pass", this.passwordInputed);
      params.append("_csrf", this.$store.state.csrf);

      await this.axios
        .post("/api/login", params)
        .then(async (response) => {
          this.$router.push({
            name: "AboutView",
          });
        })
        .catch((e) => {})
        .finally(() => {
          this.loading = false;
        });
    },
  },
};
</script>

<style scoped>
.title-col {
  border-bottom: solid 0.1rem #e7e6e6;
}
.login-card {
  box-shadow: none !important;
}
.v-card__text {
  font-size: 1rem;
}
.inline-block {
  display: inline-block;
}
.login-error-text {
  width: 90%;
  vertical-align: middle;
  margin: 0;
}
.no-underline {
  text-decoration: none;
}
.main-content-area {
  width: 65%;
  margin: 5rem auto;
}
.e-stand-img {
  max-width: 9rem;
  margin: 0 auto;
  margin-bottom: 1rem;
}
/* ↓スマホとタブレットの場合 */
@media screen and (max-width: 959.9px) {
  .error-massage {
    max-width: 80%;
    position: absolute !important;
    top: 13px;
  }
  .v-btn--rounded {
    border-radius: 1.2rem;
  }
  .e-stand-img {
    width: 8rem;
  }
  .v-input--checkbox >>> .v-input--selection-controls__ripple:before {
    background: none;
  }
  .main-content-area {
    width: 95%;
    position: absolute !important;
    top: 50px;
  }
  .main-container {
    position: relative !important;
    overflow: hidden !important;
  }
}
@media screen and (min-width: 960px) {
  .img-col {
    margin-bottom: 2rem;
  }
  .v-btn--rounded {
    border-radius: 1.5rem;
  }
  .error-massage {
    max-width: 80%;
    margin: 0 auto;
  }
}
</style>
