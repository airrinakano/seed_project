<template>
  <div class="container">
    <div class="item-image">
      <img class="full-image" :src="currentImageUrl.src" />
      <div class="images">
        <div v-for="(image, index) in images" :key="index">
          <v-img :src="image.src" @mouseover="imageMouseOver(index)" />
        </div>
      </div>
    </div>
    <div class="item-description">
      <h1>{{ title }}</h1>
      <p>¥{{ unitPrice }}</p>
      <p>個数</p>
      <number-input-spinner
        :min="0"
        :max="100"
        :step="1"
        :integer-only="true"
        v-model="number"
      ></number-input-spinner>
      <v-divider></v-divider>
      <v-btn @click="goToCart">カートに追加する</v-btn>
    </div>
  </div>
</template>

<script>
import NumberInputSpinner from "vue-number-input-spinner";

export default {
  name: "ItemDetail",
  props: {},
  components: {
    NumberInputSpinner,
  },
  mounted() {
    this.title = "エダマメの種 スターターセット";
    this.unitPrice = 3000;
    this.thumbnail =
      "https://junpei-sugiyama.com/wp-content/uploads/2021/01/dog01.jpg";
    this.id = 1;
  },
  created() {
    this.currentImageUrl = this.images[0];
  },
  data() {
    return {
      images: [
        {
          src: "https://junpei-sugiyama.com/wp-content/uploads/2021/01/dog01.jpg",
        },
        {
          src: "https://junpei-sugiyama.com/wp-content/uploads/2021/01/dog02.jpg",
        },
        {
          src: "https://junpei-sugiyama.com/wp-content/uploads/2021/01/dog03.jpg",
        },
      ],
      currentImageIndex: 0,
      number: 0,
      title: "",
      thumbnail: "",
      unitPrice: 0,
      id: 0,
    };
  },

  computed: {
    currentImageUrl() {
      return this.images[this.currentImageIndex];
    },
  },
  methods: {
    imageMouseOver(index) {
      this.currentImageIndex = index;
    },
    goToCart() {
      //storeに導入
      //商品の単価と商品数
      var items = {
        id: this.id,
        title: this.title,
        thumbnail: this.thumbnail,
        num: this.number,
        unitPrice: this.unitPrice,
        sum: this.number * this.unitPrice,
      };
      this.$store.commit("setCartList", items);
      this.$router.push({
        name: "CartView",
      });
    },
  },
  watch: {},
};
</script>

<style lang="scss" scoped>
.container {
  display: flex;
  margin-top: 70px;
}
.item-image {
  flex-grow: 1;
}
.item-description {
  flex-grow: 1;
  h1 {
    font-size: 22px;
    letter-spacing: 0.05em;
    font-weight: 700;
    line-height: calc((30 / 22) * 1em);
    margin: 30px auto;
  }

  p {
    font-size: 15px;
    letter-spacing: 0.05em;
    font-weight: 700;
    line-height: calc((30 / 22) * 1em);
  }
  .v-btn {
    width: 450px;
    padding: 16px 20px;
    border-radius: 5px;
    background-color: #000;
    border: 1px solid #000;
    color: #fff;
    font-size: 14px;
    font-weight: 700;
    height: 63px;
    margin: 0 auto;
  }
}
.v-divider {
  margin: 48px 0;
}
.full-image {
  width: 600px;
  height: auto;
  display: block;
  margin-top: 30px;
  margin-left: auto;
  margin-right: auto;
}
.v-image {
  width: 185px;
  height: auto;
  display: block;
}
.img-link {
  display: flex;
}
.images {
  width: 600px;
  margin-left: auto;
  margin-right: auto;
  margin-top: 30px;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
body {
  background-color: #f7f7f7;
}
</style>
