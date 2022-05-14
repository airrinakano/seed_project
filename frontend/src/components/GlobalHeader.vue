<template>
  <div>
    <header class="header" :class="{ sticky: position > 0 }" :color="bg">
      <v-spacer></v-spacer>
      <v-row no-gutters>
        <v-col><router-link to="/about"> ABOUT </router-link></v-col>
        <v-col> <router-link to="/demo">CONCEPT</router-link></v-col>
        <v-col><router-link to="/item"> ITEMS</router-link></v-col>
        <v-col> <router-link to="/login"> LOGIN</router-link></v-col>
        <v-col> <router-link to="/contact"> CONTACT</router-link></v-col>
        <v-col> <router-link to="/cart"> CART</router-link></v-col>
      </v-row>
    </header>
    <v-img class="banner" src="@/assets/seedlings-4933589_1280.jpeg"></v-img>
    <div class="scrolldown1"><span>Scroll</span></div>
    <div class="sub-title">
      <h1>すべての命は種から始まる</h1>
      <p>
        種をつけるのは、植物として当たり前の生命活動。<br />
        種は、植物自身が命のリレーをしてつないできたものです。<br />
        農家が育てた野菜から自分で種を採ること。<br />
        そして採った種で次の野菜を作ること。<br />
        農家は一番元気で子孫を残していくのに相応しい野菜を選び、<br />
        その土地と環境、そして自分の栽培方法に合った品種を育てて行きます。<br />
        自家採種を何度も繰り返すうちに個性のある品種が生まれてきます。<br />
      </p>
    </div>
  </div>
</template>

<script>
import eStandImgPass from "@/assets/seeds-4810524__480.jpeg";
export default {
  name: "GlobalHeader",
  props: {
    msg: String,
  },
  methods: {
    changeColor() {
      if (
        document.body.scrollTop > 300 ||
        document.documentElement.scrollTop > 300
      ) {
        this.bg = "transparent";
      } else {
        this.bg = "background: rgba(0,0,0,.4);";
      }
    },
  },
  data: () => ({ bg: "", eStandImgPass: "" }),
  computed: {},
  mounted() {
    window.onscroll = () => {
      this.changeColor();
      this.eStandImgPass = eStandImgPass;
    };
    document.onscroll = (e) => {
      this.position =
        document.documentElement.scrollTop || document.body.scrollTop;
    };
  },
};
</script>

<style scoped>
.banner {
  top: 0;
  z-index: 1;
  width: 100%;
}
p {
  font-size: 12px;
  font-weight: 700;
  line-height: 2em;
  font-family: \6e38\30b4\30b7\30c3\30af\4f53, YuGothic,
    \6e38\30b4\30b7\30c3\30af Medium, Yu Gothic Medium,
    \6e38\30b4\30b7\30c3\30af, Yu Gothic, sans-serif;
}
h1 {
  font-size: 23px;
  font-weight: 700;
  letter-spacing: 0.05em;
  font-family: \6e38\30b4\30b7\30c3\30af\4f53, YuGothic,
    \6e38\30b4\30b7\30c3\30af Medium, Yu Gothic Medium,
    \6e38\30b4\30b7\30c3\30af, Yu Gothic, sans-serif;
}
header {
  z-index: 100000;
  text-align: center;
  position: fixed;
  width: 100%;
  color: #888;
  background: white;
  height: 1rem;
  transition: all 0.3s ease;
}
.sticky {
  background: rgba(0, 0, 0, 0.4);
  text-align: left;
  text-shadow: 0px 1px 2px #777;
  color: white;
  font-size: 1rem;
  padding-left: 10px;
  height: 7rem;
  line-height: 4rem;
}
.toTop {
  position: fixed;
  right: 0;
  bottom: 0;
  height: 3rem;
  line-height: 3rem;
  color: white;
  text-align: center;
  width: 100px;
  cursor: pointer;
  transition: all 0.3s ease;
  background: black;
}
.sub-title {
  line-height: 2.5;
  position: absolute;
  top: 30%;
  left: 25%;
  z-index: 1000000000;
  width: 100%;
  color: white;
}

.col {
  cursor: pointer;
  text-align: center;
}
.row {
  line-height: 7rem;
}

a {
  text-decoration: none;
  position: relative;
  text-shadow: 0px 1px 2px #777;
  line-height: 4rem;
  color: white;
  font-family: PT Sans, sans-serif;
  font-weight: 700;
  letter-spacing: 0.05em;
  width: 100%;
}
a::after {
  position: absolute;
  bottom: 2px;
  left: 0;
  content: "";
  width: 100%;
  height: 2px;
  background: white;
  opacity: 0;
  visibility: hidden;
  transition: 0.3s;
}
a:hover::after {
  bottom: -10px;
  opacity: 1;
  visibility: visible;
}

/*====== 9-1-1 縦線が動いてスクロールを促す =======*/

/*スクロールダウン全体の場所*/
.scrolldown1 {
  z-index: 2;
  /*描画位置※位置は適宜調整してください*/
  position: absolute;
  left: 50%;
  bottom: 10px;
  /*全体の高さ*/
  height: 50px;
}

/*Scrollテキストの描写*/
.scrolldown1 span {
  /*描画位置*/
  position: absolute;
  left: -15px;
  top: -15px;
  /*テキストの形状*/
  color: #eee;
  font-size: 0.7rem;
  letter-spacing: 0.05em;
}

/* 線の描写 */
.scrolldown1::after {
  content: "";
  /*描画位置*/
  position: absolute;
  top: 0;
  /*線の形状*/
  width: 1px;
  height: 300px;
  background: #eee;
  /*線の動き1.4秒かけて動く。永遠にループ*/
  animation: pathmove 1.4s ease-in-out infinite;
  opacity: 0;
}

/*高さ・位置・透過が変化して線が上から下に動く*/
@keyframes pathmove {
  0% {
    height: 0;
    top: 0;
    opacity: 0;
  }
  30% {
    height: 30px;
    opacity: 1;
  }
  100% {
    height: 0;
    top: 50px;
    opacity: 0;
  }
}

@media screen and (min-width: 768px) and (max-width: 1024px) {
}
</style>
