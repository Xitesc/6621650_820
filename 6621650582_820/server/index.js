const http = require('http')
const host = 'localhost'
const port = 8000 
const requestListener = function (req, res){
    res.writeHead(200)
    res.end('My first Server ' )

}
const server = http.createServer(requestListener)
    server.requestListener(port,host,()=>{
        console.log('Server is running  on http://${host}:${port}')

    })

    
