<template>
  <div id="app">
    <global-header></global-header>
    <router-view />
    <global-footer />
  </div>
</template>

<script>
import GlobalHeader from "@/components/GlobalHeader.vue";
import GlobalFooter from "@//components/GlobalFooter.vue";

export default {
  name: "App",
  components: { GlobalHeader, GlobalFooter },
  data: () => ({}),
};
</script>

<style scoped>
* {
  font-family: 游ゴシック !important;
}
.v-application--wrap {
  min-height: unset;
}
</style>
