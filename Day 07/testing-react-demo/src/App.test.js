import { render, screen } from '@testing-library/react';
import App from './App';

describe('Testing the App Component', ()=>{

test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});

test('renders save to reload', () => {
  render(<App />);
  const linkElement = screen.getByText(/save to reload/i);
  expect(linkElement).toBeInTheDocument();
});
});