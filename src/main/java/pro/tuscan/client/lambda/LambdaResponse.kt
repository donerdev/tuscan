package pro.tuscan.client.lambda

data class LambdaResponse(val message: String) {
}

data class LambdaRequest(val matchId: String, val demoUrl: String)
