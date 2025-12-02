// ":" is used as delimiter between hostname and IP address
def ipFromHostIp(hostIpString) {
  if (!hostIpString) {
      return null
  }
  def parts = hostIpString.split(':')
  if (parts.length == 2) {
      return parts[1].trim()
  }
  return null
}

def csvStrToList(csvString) {
    if (!csvString) {
        return []
    }
    return csvString.split(',').collect { it.trim() }
}
