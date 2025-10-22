def call(String url, String branch){
  git url: "${url}", branch: "${branch}"
  echo "Git Code Clone Successfully"
}
