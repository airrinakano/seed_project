<template>
  <div>
    <item class="item-content" />
  </div>
</template>
<script>
import Item from "../components/Item.vue";
export default {
  name: "ItemView",
  components: {
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
.item-content {
  margin-top: 100px;
}
</style>
