<template>
  <div id="app">
    <global-header v-if="!isLanding"></global-header>
    <landing v-if="isLanding"></landing>
    <router-view class="main-contain" />
    <global-footer />
  </div>
</template>

<script>
import GlobalHeader from "@/components/GlobalHeader.vue";
import Landing from "@/components/Landing.vue";
import GlobalFooter from "@//components/GlobalFooter.vue";

export default {
  name: "App",
  components: { GlobalHeader, GlobalFooter, Landing },
  data: () => ({}),
  computed: {
    isLanding: function () {
      return this.$route.name == "AboutView";
    },
  },
};
</script>

<style scoped>
* {
  font-family: \6e38\30b4\30b7\30c3\30af\4f53, YuGothic,
    \6e38\30b4\30b7\30c3\30af Medium, Yu Gothic Medium,
    \6e38\30b4\30b7\30c3\30af, Yu Gothic, sans-serif;
}
.v-application--wrap {
  min-height: unset;
}
.main-contain {
  margin-top: 10rem;
}
</style>
