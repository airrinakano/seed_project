<template>
  <div class="footer--center">
    <ul class="footer__navigation list--reset">
      <li>
        <a
          href="/"
          class="footer__nav-link mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">TOP</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/concept"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">コンセプト</span>
        </a>
      </li>

      <li>
        <a
          href="/blogs/magazine"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">記事一覧</span>
        </a>
      </li>

      <li>
        <a
          href="/collections/all"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">商品一覧</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/guide"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">ご利用ガイド</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/faq"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">よくある質問</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/contact"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">お問い合わせ</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/privacy-policy"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">プライバシーポリシー</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/law"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">取引規定</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/regulation"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">特定商取引に基づく表記</span>
        </a>
      </li>

      <li>
        <a
          href="/pages/rule"
          class="footer__nav-link inline-block mobile-nav__link color--primary-text"
        >
          <span class="footer__nav-link-span">利用規約</span>
        </a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "GlovbalFooter",
  props: {},
  methods: {},
  data: () => ({}),
  computed: {},
  mounted() {},
};
</script>

<style lang="scss" scoped>
.list--reset {
  list-style: none;
  padding-left: 0;
  margin: 0;
  display: flex;
  flex-wrap: wrap;
}
.footer--center {
  width: 650px;
  margin: 50px auto;
}
li {
  width: 210px;
  margin-top: 12px;
}
.footer__nav-link-span {
  font-size: 12px;
  letter-spacing: 0.05em;
  color: #000;
}
a {
  text-decoration: none;
}

a::after {
  position: absolute;
  bottom: 2px;
  left: 0;
  content: "";
  width: 100%;
  height: 2px;
  opacity: 0;
  visibility: hidden;
  transition: 0.3s;
}
a:hover::after {
  bottom: 0px;
  opacity: 1;
  color: black;
  visibility: visible;
}

.footer__nav-link-span:after {
  content: ">";
  right: 0;
  top: -4px;
}

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
}
.about-btn {
  margin-top: 40px;
}
</style>
