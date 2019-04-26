# Mulesoft HTTP File Upload

```
Mulesoft Version 3.9
Created on 21-Feb-2019
Last updated on 21-Feb-2019
Last updated by SenthilKumar
```

Mulesoft Http file upload example shows how to upload a file from a static html 
page using the HTTP static resource handler component. when an user upload a file, 
mule receives the files as attachment and then uploads the same file through 
a http request component, finally the file is received and saved in a configured 
temp folder. 

Following are the enpoint configured in this example
 * http://localhost:8081/api/console
 * http://localhost:8081/api/file
 * http://localhost:8081/api/upload_browser
 * http://localhost:8081/api/upload_mule

```
  <form method="POST" action="/api/upload_browser" enctype="multipart/form-data">
    <h3>Mulesoft Http File Upload Service</h3>
    <input type="file" required="required" name="file">
    <button type="submit">Submit</button>
  </form>
``` 

## File upload flow
![http file upload flow](https://github.com/toskumar/mulesoft/blob/master/http_file_upload/doc/http_file_upload_flow.jpg)

## File upload static page
![http file upload static page](https://github.com/toskumar/mulesoft/blob/master/http_file_upload/doc/http_file_upload_static_page.jpg)

Open the link after code deployment in mule 3.9 runtime http://localhost:8081/api/file
