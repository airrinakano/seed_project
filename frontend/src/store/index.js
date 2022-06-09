import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    cartList: [],
    csrf: "",
    login: {
      userId: "",
      userName: "",
    },
  },
  getters: {},
  mutations: {
    setCartList(state, response) {
      state.cartList.push(response);
    },
    destroyCartList(state) {
      state.cartList = [];
    },
    setCsrf(state, response) {
      state.csrf = response;
    },
    destroyCsrf(state) {
      state.csrf = "";
    },
    setLogin(state, response) {
      state.userId = response.userId;
      state.userName = response.userName;
    },
    destroyLogin(state) {
      state.csrf = "";
      state.userId = "";
      state.userName = "";
    },
  },
  actions: {},
  modules: {},
});
