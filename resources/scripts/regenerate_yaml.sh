#!/bin/bash
# This script reads key-value pairs from a properties file and updates a YAML configuration file accordingly.

#Usage: ./regenerate_yaml.sh config.properties config.yaml
CONF_FILE="${1}"
YAML_FILE="${2}"

while IFS=':' read -r key value; do
  # Export the value to an environment variable
  export VAL="$value"
  # Use strenv to safely inject it
  yq -i ".${key} = strenv(VAL)" "${YAML_FILE}"
done < "${CONF_FILE}"