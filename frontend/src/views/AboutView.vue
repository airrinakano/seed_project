<template>
  <div class="about">
    <h1>This is an about page</h1>
    <about />
    <item />
  </div>
</template>
<script>
import About from "../components/About.vue";
import Item from "../components/Item.vue";
export default {
  name: "AboutView",
  components: {
    About,
    Item,
  },
  props: {},
  methods: {},
  data: () => ({}),
  computed: {},
  mounted() {},
};
</script>

<style lang="scss" scoped></style>
