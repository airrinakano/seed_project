import Vue from "vue";
import VueRouter from "vue-router";

import landing from "./views/landing";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "landing",
    // この場合、App.vueで配置した名前なしのrouter-viewのみ切り替わります。
    component: landing,
  },
];

const router = new VueRouter({
  mode: "history",
  routes: routes,
});

export default router;
