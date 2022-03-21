<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <router-link to="/" class="link">Home</router-link>
  </div>
</template>

<script>
export default {
  name: "GlobalHeader",
  props: {
    msg: String,
  },
};
</script>

<style scoped></style>
