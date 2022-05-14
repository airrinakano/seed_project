<template>
  <v-data-table
    :headers="headers"
    :items="items"
    :total-items="items.length"
    rows-per-page-items="5"
    hide-action
    item-key="title"
  >
    <!-- サムネイル -->
    <template v-slot:[`item.thumbnail`]="{ item }">
      <v-img
        :src="item.thumbnail"
        :aspect-ratop="16 / 9"
        height="9vw"
        min-height="100px"
        width="16vw"
        min-width="160px"
        class="ma-0 pa-0"
      ></v-img>
    </template>
    <template v-slot:[`item.num`]="{ item, index }">
      <v-text-field
        v-model="item.num"
        name="quantity"
        outlined
        @input="getdata(index)"
        type="number"
      ></v-text-field>
    </template>
  </v-data-table>
</template>

<script>
export default {
  name: "CartTable",
  props: {},
  data: () => ({
    headers: [
      {
        text: "CART",
        align: "start",
        sortable: false,
        value: "thumbnail",
        width: "30%",
      },
      {
        text: "",
        value: "title",
        align: "left",
        sortable: false,
      },
      { text: "数量", value: "num", sortable: false },
      { text: "合計", value: "sum", sortable: false },
    ],
    items: [
      {
        title: "Star Wars: A new Hope",
        thumbnail:
          "https://cdn.pixabay.com/photo/2021/09/22/05/06/city-6645646_960_720.jpg",
        num: 1,
        unitPrice: 3000,
        sum: 3000,
      },
      {
        title: "Star Wars: The Empire Strike back",
        thumbnail:
          "https://cdn.pixabay.com/photo/2021/09/22/05/06/city-6645646_960_720.jpg",
        num: 2,
        unitPrice: 3000,
        sum: 6000,
      },
      {
        title: "Star Wars: The Return of Jedi",
        thumbnail:
          "https://cdn.pixabay.com/photo/2021/09/22/05/06/city-6645646_960_720.jpg",
        num: 3,
        unitPrice: 3000,
        sum: 9000,
      },
      {
        title: "Star Wars: The Phanton Menace",
        thumbnail:
          "https://cdn.pixabay.com/photo/2021/09/22/05/06/city-6645646_960_720.jpg",
        num: 1,
        unitPrice: 3000,
        sum: 3000,
      },
      {
        title: "Star Wars: Attack of the Clones",
        thumbnail:
          "https://cdn.pixabay.com/photo/2021/09/22/05/06/city-6645646_960_720.jpg",
        num: 2,
        unitPrice: 6000,
        sum: 12000,
      },
    ],
    lazy: `https://goo.gl/jbJWmK`,
  }),
  created() {},
  computed: {},
  mounted: {},
  methods: {
    format(date) {
      date = new Date(date);
      const day = `${date.getUTCDate()}`.padStart(2, "0");
      const month = `${date.getUTCMonth() + 1}`.padStart(2, "0");
      const year = date.getFullYear();
      return `${month}/${day}/${year}`;
    },
    getdata(index) {
      console.log(this.items[index].num);
      if (this.items[index].num == 0) {
        this.items.splice(index, 1);
      }
      this.items[index].sum =
        this.items[index].unitPrice * this.items[index].num;
    },
  },
  watch: {},
};
</script>

<style lang="scss" scoped>
.cart-table {
  width: 970px !important;
}
.v-data-table {
  margin: 0 auto;
}
</style>
