<template>
  <a-layout id="components-layout-demo-top-side-2">
    <the-header-view></the-header-view>
    <a-layout>
      <the-sider-view></the-sider-view>
      <a-layout-content
          :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
      >
        所有会员总数: {{count}}
        <router-view></router-view>
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>
<script>
import {defineComponent, reactive, ref} from 'vue';
import TheHeaderView from "@/components/the-header";
import TheSiderView from "@/components/the-sider";
import axios from "axios";
import {notification} from "ant-design-vue";
// import store from "@/store";

export default defineComponent({
  components: {
    TheSiderView,
    TheHeaderView,
  },
  setup() {
    const count = ref(0);
    const loginForm = reactive({
      mobile: '13000000000',
      code: '',
    });
    axios.get("/member/member/count", loginForm).then((response) => {
      let data = response.data;
      if (data.success) {
        count.value = data.content;
      } else {
        notification.error({ description: data.message });
      }
    })
    return {
      count
    };
  },
});
</script>
<style>

</style>
