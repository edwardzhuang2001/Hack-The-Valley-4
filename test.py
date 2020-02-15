import requests
import json

USERS_ENDPOINT = "https://api.radar.io/v1/users"
GEOFENCES_ENDPOINT = "https://api.radar.io/v1/geofences"
EVENTS_ENDPOINT = "https://api.radar.io/v1/events"
TEST_SECRET_KEY = "prj_test_sk_a6a5b26c2ebab809f5d0789d42b5bae913982def"
TEST_PUBLISHABLE_KEY = "prj_test_pk_0ae22efb1fa81ae4af6c3e91bd2f151931689ff8"

request_headers = {
    "Authorization": TEST_SECRET_KEY
}

''' above code is useful for actual program '''

test_geofence_input = {
    "description": "test geofence",
    "type": "circle",
    "coordinates": [-79.18829441070557, 43.78636197917316],
    "radius": 50,
    "tag": "safety",
    "enabled": "true",
}


geofence_response = requests.post(url=GEOFENCES_ENDPOINT, data=test_geofence_input, headers=request_headers)
geofence_response_data = geofence_response.json()

user_response = requests.get(url=USERS_ENDPOINT, headers=request_headers)
user_response_data = user_response.json()


print(geofence_response_data)
print(user_response_data)