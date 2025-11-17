// vars/getDynamicClients.groovy
def call(location) {
    def clients = ["ClientA", "ClientB"]
    if (location == "Remote") {
        clients.add("RemoteClientX")
    } else {
        clients.add("LocalClientY")
    }
    return clients
}