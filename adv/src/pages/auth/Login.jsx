// LoginPage.js
import { useState } from 'react';
import { TextField, Button, Typography, Container, Link, InputAdornment, IconButton } from '@mui/material';
import { Visibility, VisibilityOff } from '@mui/icons-material';
import { useNavigate } from 'react-router-dom';
import "../../assets/css/Login.css";

const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [showPassword, setShowPassword] = useState(false);
  const navigate = useNavigate();

  const handleSubmit = () => {
    navigate('/home');
  };
  const handleSignup = () => {
    navigate('/');
  };

  return (
    <div style={{ marginTop: '100px', marginBottom: '100px', marginLeft: '467px', marginRight: '467px', align: 'center', backgroundColor: '#ffffff', paddingTop: '0px', paddingBottom: '0px', borderRadius: '10px', boxShadow: '0px 0px 10px 0px rgba(0, 0, 0,1)', display: 'flex', justifyContent: 'center', alignItems: 'center', minHeight: '50vh' }}>
      <Container maxWidth="sm">
        <Typography variant="h4" align="center" gutterBottom>
          LOGIN
        </Typography>
        <form onSubmit={handleSubmit}>
          <TextField
            label="Email"
            type="email"
            fullWidth
            margin="normal"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <br />
          <TextField
            label="Password"
            type={showPassword ? 'text' : 'password'}
            fullWidth
            margin="normal"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            InputProps={{
              endAdornment: (
                <InputAdornment position="end">
                  <IconButton
                    onClick={() => setShowPassword(!showPassword)}
                    edge="end"
                  >
                    {showPassword ? (
                      <Visibility />
                    ) : (
                      <VisibilityOff />
                    )}
                  </IconButton>
                </InputAdornment>
              ),
              style: { color: 'black' },
            }}
          />
          <br />
          <center>
            <Button
              type="submit"
              variant="contained"
              color="primary"
              disabled={!email || !password}
              style={{ marginTop: '20px', width: '80px' }}
            >
              Login
            </Button>
          </center>
        </form>
        <Typography variant="body1" align="center" style={{ marginTop: '10px' }}>
          Do not have an account?{' '}
          <Link to="/">
            <Button onClick={handleSignup}>Sign Up</Button>
          </Link>
        </Typography>
      </Container>
    </div>
  );
};

export default LoginPage;
