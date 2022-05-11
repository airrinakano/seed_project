<template>
  <div class="cart-container">
    <cart-table class="cart-table" />
  </div>
</template>

<script>
import CartTable from "../components/CartTable.vue";
export default {
  components: { CartTable },
  name: "CartView",
  props: {},
  created() {},
  computed: {},
  mounted: {},
  methods: {},
  watch: {},
};
</script>

<style lang="scss" scoped>
h2 {
  font-weight: 700;
  margin-top: 0;
  font-family: PT Sans, sans-serif;
  color: #000;
  font-size: 28px;
  width: 200px;
}

.cart-container {
  margin: 20px auto;
}

.cart-table {
  width: 700px;
}
</style>
