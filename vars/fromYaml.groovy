import org.yaml.snakeyaml.Yaml

def fromYaml(String environment) {
// Option 1: YAML as a string
  def yamlString = """
  environments:
    - dev
    - test
    - prod
  services:
    - webapp
    - database
  """

  // Option 2: Read YAML from a file (assuming a file named 'config.yaml' in the workspace)
  // def yamlFile = new File(env.WORKSPACE + "/config.yaml")
  // def yamlString = yamlFile.text

  def yaml = new Yaml()
  def data = yaml.load(yamlString)

  def choices = []

  if (data.containsKey(optiontype)) {
      data[optiontype].each { env ->
          choices << env
      }
  }

  return choices
}