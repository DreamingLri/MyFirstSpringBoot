<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <Movie v-for="movie in movies" :key="movie.id" :title="movie.title" :rating="movie.rating"></Movie>
</template>

<script>


import Movie from "@/components/Movie.vue";

export default {
  name: 'App',
  data:function (){
    return{
      movies:[
        {id: 1, title:"111", rating: 11},
        {id: 2, title:"222", rating: 22},
        {id: 3, title:"333", rating: 33},
      ]
    }
  },
  components: {
    Movie
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
