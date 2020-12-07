//src/components/Navbar.vue
<template>
    <div>
      <b-navbar toggleable="lg" type="dark" variant="success">
        <b-container>
            <b-navbar-brand href="#">MySQL Sakila DB</b-navbar-brand>
            <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>
            <b-collapse id="nav-collapse" is-nav>
              <!-- Right aligned nav items -->
              <b-navbar-nav class="ml-auto">

               
                <b-nav-item-dropdown>
                  <!-- Using 'button-content' slot -->
                  <template slot="button-content"><em>Actions</em></template>
                  <b-dropdown-item to="/">Home</b-dropdown-item>
                  <b-dropdown-item to="/about">About</b-dropdown-item>
                  <b-dropdown-item to="/films">Movies</b-dropdown-item>
                  <b-dropdown-item to="/customers">Customers</b-dropdown-item>
                  <b-dropdown-item to="/rentals">Rentals</b-dropdown-item>
                </b-nav-item-dropdown>

                <b-nav-form>
                  <b-form-input 
                    size="sm" 
                    class="mr-sm-2" 
                    placeholder="Search for a meal"
                    v-model="meal"
                    ></b-form-input>
                  <b-button 
                    size="sm" 
                    class="my-2 my-sm-0" 
                    type="submit" 
                    @click.prevent="getMeal"
                    >Search</b-button>
                </b-nav-form>

                <b-nav-item-dropdown right>
                  <!-- Using 'button-content' slot -->
                  <template slot="button-content"><em>User</em></template>
                  <b-dropdown-item href="#">Profile</b-dropdown-item>
                  <b-dropdown-item href="#">Sign Out</b-dropdown-item>
                </b-nav-item-dropdown>
              </b-navbar-nav>
            </b-collapse>
          </b-container>
      </b-navbar>

      <div><router-view/></div>
      
    </div>  
    
</template>
<script>
export default {
    data() {
        return {
            meal: ''
        }
    },
  methods: {
    getMeal() {
      //...
    }
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
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
