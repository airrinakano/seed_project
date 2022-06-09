import Vue from "vue";
import VueRouter from "vue-router";
import HomeView from "../views/HomeView.vue";
import AboutView from "../views/AboutView.vue";
import LoginView from "../views/LoginView.vue";
import CartView from "../views/CartView.vue";
import ItemDetail from "../views/ItemDetailView.vue";
import ItemView from "../views/ItemView.vue";
import store from "@/store/index.js";

Vue.use(VueRouter);

const router = new VueRouter({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/about",
      name: "AboutView",
      component: AboutView,
    },
    {
      path: "/login",
      name: "LoginView",
      component: LoginView,
    },
    {
      path: "/cart",
      name: "CartView",
      component: CartView,
    },
    {
      path: "/itemDetail",
      name: "ItemDetail",
      component: ItemDetail,
    },
    {
      path: "/item",
      name: "ItemView",
      component: ItemView,
    },
  ],
});

// router gards
router.beforeEach((to, from, next) => {
  //   // トークンが存在、かつログイン有効期限を過ぎてない場合、またはログイン画面の場合
  if (store.state.login.userId != "") {
    next();
  } else {
    //TODO ログイン画面に遷移
    next();
  }
  //  else {
  //     console.log(to.name);
  //     // ログイン画面に飛ばす。ログイン後に元の画面に戻れるよう、backuriパラメーターにリダイレクト前のURLを入れる
  //     // next({ name: "LoginView" });
  //   }
});

export default router;
