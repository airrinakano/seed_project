<template>
  <v-app id="inspire">
    <v-app-bar
      v-if="!$vuetify.breakpoint.xs"
      prominent
      flat
      app
      :height="height"
    >
      <v-container class="pa-0" fluid>
        <v-row class="justify-end" no-gutters>
          <v-col> about</v-col>
          <v-col> share</v-col>
          <v-col> how to grow</v-col>
        </v-row>
      </v-container>
    </v-app-bar>
  </v-app>
</template>

<script>
export default {
  name: "GlobalHeader",
  props: {
    msg: String,
  },
  computed: {
    height: function () {
      if (this.isDisplaySystemMaintenanceNoticeMessage && this.isTopPage) {
        return "200px";
      } else if (
        (!this.$vuetify.breakpoint.xs && !this.isTopPage) ||
        (!this.$vuetify.breakpoint.xs &&
          !this.isDisplaySystemMaintenanceNoticeMessage &&
          this.isTopPage)
      ) {
        return "140px";
      } else {
        return "90px";
      }
    },
  },
};
</script>

<style scoped></style>
