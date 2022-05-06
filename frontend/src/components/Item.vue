<template>
  <div>
    <h2>Items</h2>
    <p>商品一覧</p>
    <div class="supplier">
      <div class="item">
        <img src="@/assets/images (1).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (3).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (4).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (5).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (6).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (7).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (8).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (9).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (10).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (11).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (12).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Item",
  props: {},
  methods: {},
  data: () => ({}),
  computed: {},
  mounted() {},
};
</script>

<style lang="scss" scoped>
.supplier {
  display: flex;
  justify-content: center;
  flex-wrap: wrap;
  gap: 10px 41px;
  margin: 55px;
}
h2,
p {
  text-align: center;
}
.item {
  display: flex;
  flex-flow: column;
  width: 300px;
  span {
    text-align: center;
  }
}
</style>
