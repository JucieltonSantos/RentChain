require('babel-register')

module.exports = {
  networks: {
    development: {
      host: 'localhost',
      port: 8545,
      network_id: '127.0.0.1' // Match any network id
    },
    ropsten: {
      host: "localhost",
      port: 8545,
      network_id: "3",
    }
  }
}