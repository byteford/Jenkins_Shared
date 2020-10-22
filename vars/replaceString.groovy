def call(String file){
    echo "replace string"
    def text = readFile file: "${file}"
    text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
    writeFile file: "${file}", text: text
}
