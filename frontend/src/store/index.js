import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    cartList: [],
    csrf: "",
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
  },
  actions: {},
  modules: {},
});
