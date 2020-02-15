import requests
import json

ENDPOINT_URL = "https://api.radar.io/v1/users"
TEST_PUBLISHABLE_KEY = "prj_test_pk_0ae22efb1fa81ae4af6c3e91bd2f151931689ff8"

response = requests.get(url=ENDPOINT_URL)
response_data = response.json()

print(response_data)
print("hello world")
2 + 5