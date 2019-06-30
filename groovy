import groovy.json.JsonSlurperClassic
def cmd = "aws ecr list-images --repository-name ${APPLICATION}  --filter tagStatus=TAGGED --region ap-south-1"
def ecr_images_json = cmd.execute()
def data = new JsonSlurperClassic().parseText(ecr_images_json.text)
def ecr_images = [];
data.imageIds.each { ecr_images.push(it.imageTag) }
return ecr_images
