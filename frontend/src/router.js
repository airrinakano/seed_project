import Vue from "vue";
import VueRouter from "vue-router";

import Landing from "./views/landing";

Vue.use(VueRouter);

const routes = [
  {
    path: "/landing",
    name: "Landing",
    // この場合、App.vueで配置した名前なしのrouter-viewのみ切り替わります。
    component: Landing,
  },
];

const router = new VueRouter({
  mode: "history",
  routes: routes,
});

export default router;
