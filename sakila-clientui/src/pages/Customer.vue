<template>
  <q-page padding>
    <!-- content -->
    <h1>Customers</h1>
  </q-page>
</template>


<style lang="css"></style>

<script>
export default {
  name: 'Customer',
  data() {
    return {
      customers: []
    }
  },
  methods: {
     
  },
  mounted() {
    this.axios.get("http://localhost:8080/api/backend/customers")
    .then(response => {
      this.customers = response.data.results
    })
  }
}
</script>