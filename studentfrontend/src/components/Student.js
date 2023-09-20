import * as React from 'react';
import { useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container, Paper } from '@mui/material';
import Button from '@mui/material/Button';


export default function Student() {
    const paperStyle={padding:'50px 20px', width:600, margin:"20px auto"}
    const[name,setName]=useState('')
    const[addr,setAddr]=useState('')
    const[students,setStudents]=useState([])

    const handleClick =(e)=>{
        e.preventDefault()
        const student={name,addr}
        console.log(student)
        fetch("http://localhost:8080/student/add", {
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify(student)
    }).then(()=>{console.log("New Student is added.")
    })
    }

    React.useEffect(()=>{
        fetch("http://localhost:8080/student/getAll")
        .then(result=>result.json())
        .then((res)=>{
            setStudents(res);
        }
        )
    },[])

  return (
    <Container>
    <Paper elevation={3} style={paperStyle}>
    <h1 style={{color:"darkgray"}}> Add Student</h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1 },
      }}
      noValidate
      autoComplete="off"
      >
      <TextField id="outlined-basic" label="Student Name" variant="outlined" fullWidth 
      value = {name}
      onChange={(e)=>setName(e.target.value)}
      />
      <TextField id="outlined-basic" label="Student Address" variant="outlined" fullWidth 
      value = {addr}
      onChange={(e)=>setAddr(e.target.value)}
      />
      <Button variant="contained" onClick={handleClick} sx={{ backgroundColor: 'gray' }}>Submit</Button>
    </Box>
    </Paper>
    <h2 style={{color:"darkgray"}}>Student List</h2>
    <Paper elevation={3} style={paperStyle}>
        {students.map(student=>(
            <Paper elevation={6} style={{padding:'15px', textAlign:'left', margin:"10px auto"}} key={student.id}>
                Id:{student.id}
                Name:{student.name}
                Address:{student.addr}
            </Paper>
        ))
        }

    </Paper>
    </Container>
  );
}
