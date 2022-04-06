<template>
  <div class="about">
    <h1>This is an about page</h1>
    <home-landing></home-landing>
  </div>
</template>

<script>
import HomeLanding from "../components/HomeLanding.vue";

export default {
  name: "Home",

  components: {
    HomeLanding,
  },
};
</script>
