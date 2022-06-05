<template>
  <div>
    <h2>Items</h2>
    <p>商品一覧</p>
    <div class="supplier">
      <div class="item">
        <img src="@/assets/images (1).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item" @click="moveToDetail(2)">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (3).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
      <div class="item">
        <img src="@/assets/images (2).jpeg" alt="" /><span>ひまわりの種</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  /* eslint-disable */
  name: "Item",
  props: {},
  methods: {
    moveToDetail: async function (orderId) {
      this.$router.push({
        name: "ItemDetail",
        params: {
          orderId: orderId,
        },
      });
    },
  },
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
    // font-size: 12px;
    font-weight: 700;
    letter-spacing: 0.05em;
  }
  img:hover {
    opacity: 0.7;
  }
}
</style>
