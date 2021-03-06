package frontlinesms2

import groovyx.net.http.HTTPBuilder

class DataUploadService {
	def upload(String url, Map dataToSend) {
		def http = new HTTPBuilder(url)
		boolean success = false
		http.post(body: dataToSend, requestContentType:URLENC) { resp ->
			success = resp.statusLine.statusCode == 200
		}
		success
	}
}

