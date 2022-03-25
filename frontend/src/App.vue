<template>
  <div id="app">
    <global-header></global-header>
    <router-view />
  </div>
</template>

<script>
import GlobalHeader from "@/components/GlobalHeader.vue";

export default {
  name: "App",
  components: { GlobalHeader },
  data: () => ({}),
};
</script>

<style scoped>
* {
  font-family: 游ゴシック !important;
}
</style>
