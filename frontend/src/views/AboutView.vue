<template>
  <div class="about">
    <about class="about-content" />
    <item class="item-content" />
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

<style lang="scss" scoped>
.about-content,
.item-content {
  margin-top: 100px;
}
</style>
