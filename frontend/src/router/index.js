import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/login'
import store from '../store'

Vue.use(Router)

export const router = new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    }
  ]
})