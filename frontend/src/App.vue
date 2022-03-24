<template>
  <div id="app">
    <global-header></global-header>
    <v-img :src="eStandImgPass"></v-img>
    <router-view />
  </div>
</template>

<script>
import GlobalHeader from "@/components/GlobalHeader.vue";
import eStandImgPass from "@/assets/seeds-4810524__480.jpeg";

export default {
  name: "App",
  components: { GlobalHeader },
  data: () => ({ eStandImgPass: "" }),
  mounted: function () {
    this.eStandImgPass = eStandImgPass;
  },
};
</script>

<style scoped>
* {
  font-family: 游ゴシック !important;
}
</style>
