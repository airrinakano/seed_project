const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: ["vuetify"],
  transpileDependencies: true,
  configureWebpack: {
    watch: true,
  },
  devServer: {
    port: 8082,
  },
});
