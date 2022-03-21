<template>
  <div id="app" class="gridLayout">
    <global-header></global-header>
  </div>
</template>

<script>
import GlobalHeader from "@/components/GlobalHeader.vue";

export default {
  name: "App",
  components: { GlobalHeader },
};
</script>

<style scoped>
.gridLayout {
  display: grid;
  width: 600px;
  grid-template-columns: repeat(2, 1fr);
  grid-auto-rows: 50px;
}
.link {
  display: flex;
  justify-content: center;
  align-items: center;
}
.title {
  display: flex;
  justify-content: center;
  align-items: center;
  grid-column: 1 / span 2;
  color: blue;
}
.content {
  display: flex;
  justify-content: center;
  align-items: center;
  grid-column: 1 / span 2;
  text-align: center;
  color: green;
}
</style>
