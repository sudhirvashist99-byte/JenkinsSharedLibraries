def call(String url, String branch){
  git url: "${url}", branch: "${branch}"
  sh 'whoami'
  sh 'docker ps'
 }
