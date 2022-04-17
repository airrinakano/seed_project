<template>
  <div class="about-container">
    <div class="phote">
      <v-img class="about-phote" src="@/assets/seeds-2267092_1280.jpeg"></v-img>
    </div>
    <div class="description">
      <h2>野菜を育てる楽しさ、 食べる喜び。</h2>
      <p>
        「こんな風に実がなるんだ！」 普段何気なく食べている野菜を育ててみると<br />
        発見がたくさんあります。<br />
        何より、自分で育てる道のりとその味は自分だけのもの。<br />
        家庭菜園がはじめてという方にも、まずは自分で植えて（UETE）みて欲しい。<br />
        自分で育てて収穫し、食べる楽しさを知って欲しい。<br />
        そして、その体験がやがて豊かな暮らし、未来をつくると願い、<br />
        私たちはこのUETE（ウエテ）というブランドを立ち上げました。
      </p>
      <div class="about-btn">
        <v-btn>ここをクリック</v-btn>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "About",
  props: {},
  methods: {},
  data: () => ({}),
  computed: {},
  mounted() {},
};
</script>

<style lang="scss" scoped>
.about-phote {
  display: inline-block;
  width: 100%;
}
.about-container {
  display: flex;
  justify-content: center;
}

.description {
  flex-basis: 55%;
  text-align: center;
}
p {
  text-align: left;
  display: inline-block;
  margin-top: 30px;
}
.phote {
  flex-basis: 45%;
  width: 40%;
  margin-left: 100px;
}
.about-btn {
  margin-top: 40px;
}
</style>
