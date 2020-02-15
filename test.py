import requests
import json

USERS_ENDPOINT = "https://api.radar.io/v1/users"
GEOFENCES_ENDPOINT = "https://api.radar.io/v1/geofences"
TEST_SECRET_KEY = "prj_test_sk_a6a5b26c2ebab809f5d0789d42b5bae913982def"
TEST_PUBLISHABLE_KEY = "prj_test_pk_0ae22efb1fa81ae4af6c3e91bd2f151931689ff8"

request_headers = {
    "Authorization": TEST_SECRET_KEY
}

test_input = {
    "description": "test geofence",
    "type": "circle",
    "coordinates": [-79.18829441070557, 43.78636197917316],
    "radius": 50,
    "tag": "safety",
    "enabled": "true",
}


response = requests.post(url=GEOFENCES_ENDPOINT, data=test_input, headers=request_headers)
response_data = response.json()

print(response_data)