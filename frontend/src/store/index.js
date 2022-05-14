import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    cartList: [],
  },
  getters: {},
  mutations: {
    setCartList(state, response) {
      state.cartList = response;
    },
    destroyCartList(state) {
      state.cartList = [];
    },
  },
  actions: {},
  modules: {},
});
