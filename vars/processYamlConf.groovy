def call(conf_file, yaml_file) {
    // 1. Load the script content from the resources folder
    def scriptContent = libraryResource('scripts/regenerate_yaml.sh')
    
    // 2. Write it to the current workspace on the agent
    writeFile(file: 'regenerate_yaml.sh', text: scriptContent)
    
    // 3. Make it executable and run it
    sh 'chmod +x regenerate_yaml.sh'
    sh "./regenerate_yaml.sh ${conf_file} ${yaml_file}"
}
