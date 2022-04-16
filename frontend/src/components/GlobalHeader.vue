<template>
  <div>
    <header class="header" :class="{ sticky: position > 0 }" :color="bg">
      <v-spacer></v-spacer>
      <v-row no-gutters>
        <v-col> about</v-col>
        <v-col> CONCEPT</v-col>
        <v-col> ITEMS</v-col>
        <v-col> about</v-col>
        <v-col> CONCEPT</v-col>
        <v-col> ITEMS</v-col>
      </v-row>
    </header>
    <v-img class="banner" src="@/assets/seeds-4810524__480.jpeg"></v-img>
    <div class="sub-title">
      <h2>心地の良い、遊べる菜園</h2>
      <span
        >都心の小さなスペースを大自然に変え <br />
        いつでも自然と繋がれる</span
      >
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
header {
  z-index: 100000;
  text-align: center;
  position: fixed;
  width: 100%;
  color: #888;
  background: white;
  text-shadow: 0px 1px 2px #777;
  color: white;
  height: 1rem;
  line-height: 10rem;
  transition: all 0.3s ease;
}
.sticky {
  background: rgba(200, 200, 200, 0.5);
  text-align: left;
  text-shadow: 0px 1px 2px #777;
  color: white;
  font-size: 1rem;
  padding-left: 10px;
  height: 4rem;
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
  position: absolute;
  top: 30rem;
  left: 56%;
  z-index: 1000000000;
  width: 100%;
  color: white;
}

@media screen and (min-width: 768px) and (max-width: 1024px) {
}
</style>
